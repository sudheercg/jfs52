package com.codegnan.java8enhancements;

import java.util.Optional;

public class BetterWithOptionalStrict {
    public static void main(String[] args) {

        // User user = new User(null);
        User user = new User(new Address("Hyderabad"));

        Optional<User> userOpt = Optional.ofNullable(user);

        String result = "Some value is missing";

        if (userOpt.isPresent()) {
            User u = userOpt.get();

            Optional<Address> addrOpt = Optional.ofNullable(u.getAddress());

            if (addrOpt.isPresent()) {
                Address addr = addrOpt.get();

                Optional<String> cityOpt = Optional.ofNullable(addr.getCity());

                if (cityOpt.isPresent()) {
                    result = cityOpt.get();
                }
            }
        }

        System.out.println(result);
    }
}