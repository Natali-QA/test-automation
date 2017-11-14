package com.waverleysoftware.assertions;

import com.waverleysoftware.model.User;
import org.assertj.core.api.AbstractAssert;
import org.assertj.core.util.Objects;

@SuppressWarnings("JavadocType")
public class UserAssert extends AbstractAssert<UserAssert, User> {

    private static final String ERROR_MESSAGE_TEMPLATE = "\nExpecting <%s> of :\n<%s>\nto be:<%s>\n but was \n <%s>";

    public UserAssert(final User user) {
        super(user, UserAssert.class);
    }

    public UserAssert hasUsername(final String username) {
        isNotNull();

        if (!Objects.areEqual(actual.getUsername(), username)) {
            failWithMessage(ERROR_MESSAGE_TEMPLATE, "[Username]", actual, username, actual.getUsername());
        }
        return this;
    }

    public UserAssert hasPassword(final String password) {
        isNotNull();

        if (!Objects.areEqual(actual.getPassword(), password)) {
            failWithMessage(ERROR_MESSAGE_TEMPLATE, "[Password]", actual, password, actual.getPassword());
        }
        return this;
    }
}
