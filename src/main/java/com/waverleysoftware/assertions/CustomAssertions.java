package com.waverleysoftware.assertions;

import com.waverleysoftware.model.User;
import lombok.experimental.UtilityClass;

@SuppressWarnings("JavadocType")
@UtilityClass
public class CustomAssertions {

    public static UserAssert assertThat(final User user) {
        return new UserAssert(user);
    }
}
