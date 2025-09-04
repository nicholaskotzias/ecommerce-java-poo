package com.nicholaskotzias;

import io.javalin.Javalin;

public class Main {
    // public static ArrayList<Produto> bdProdutos;

    public static void main(String[] args) {
        System.out.println("Hello world!");

        Javalin app = Javalin.create().start(7070);

        app.get("/tads24", ctx -> ctx.result("TADS24 EH TOP"));
    }
}