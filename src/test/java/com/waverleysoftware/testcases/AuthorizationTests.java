package com.waverleysoftware.testcases;

import com.waverleysoftware.assertions.CustomAssertions;
import io.github.sskorol.core.DataSupplier;
import one.util.streamex.StreamEx;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import com.waverleysoftware.model.User;
import io.github.sskorol.core.DataSupplier;
import org.testng.ITestContext;
import org.testng.annotations.*;

import java.lang.reflect.Method;

import static com.waverleysoftware.utils.JsonUtils.jsonToEntity;
import static java.util.Optional.ofNullable;

public class AuthorizationTests {


    @DataSupplier(name = "My provider", flatMap = true)
    public StreamEx getData(Method method) {
        return ofNullable(method.getDeclaredAnnotation(Data.class))
                .map(Data::source)
                .map(source -> jsonToEntity(source, User.class))
                .orElseGet(User::dummy);
    }

    @BeforeMethod
    public void setUp(ITestContext context, Method method) {
        System.out.println(method.getName());
        System.out.println(method.getDeclaredAnnotation(Test.class));
        System.out.println(context.getCurrentXmlTest().getParameter("browser"));
    }

    @Data(source = "data.json")
    @Test(dataProvider = "My provider")
    public void userShoulbBeAuthorizedWithValidCredentials(final User user) {
        CustomAssertions.assertThat(user).hasUsername("Dana");
    }

    @Test
    public void userShoulbBeAuthorizedWithInvalidCredentials() {
        System.out.println("User isn't authorized");
    }

    @Test
    public void userShoulbBeAuthorizedWithInvalidName() {
        System.out.println("User isn't authorized. Name is invalid.");
    }

    @Test
    public void userShoulbBeAuthorizedWithInvalidPassword() {
        System.out.println("User isn't authorized. Password is invalid.");
    }
}
