#!/bin/bash

create-test_user-file() {
    echo "The file containing the credentials for the email account used for"
    echo "automated tests is missing. Let's create it for you!"
    echo -n "Enter a real e-mail address: "
    read email
    echo -n "Enter the password: "
    read password
    echo "{:email \"$email\" :password \"$password\"}" > test_user.clj
    echo "The file test_user.clj was created with the following contents:"
    cat test_user.clj
}

[[ -f test_user.clj ]] || create-test_user-file
