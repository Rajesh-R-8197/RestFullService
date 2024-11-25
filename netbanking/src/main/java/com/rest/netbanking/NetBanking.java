package com.rest.netbanking;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.QueryParam;
import jakarta.ws.rs.core.MediaType;

import java.security.SecureRandom;

@Path("/account")
public class NetBanking {

    //method to return random number of type double
    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public double getBalance(@QueryParam("accountNo") String accountNo) {
       SecureRandom random = new SecureRandom();
        double balance = random.nextDouble();
        return balance;
    }
}
