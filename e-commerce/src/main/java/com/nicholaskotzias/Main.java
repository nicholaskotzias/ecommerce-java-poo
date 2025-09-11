package com.nicholaskotzias;


import java.util.Map;

import com.nicholaskotzias.models.Produto;

import freemarker.template.Configuration;
import io.javalin.Javalin;
import io.javalin.http.staticfiles.Location;
import io.javalin.rendering.template.JavalinFreemarker;

public class Main {
    // public static ArrayList<Produto> bdProdutos;

    public static void main(String[] args) {
        System.out.println("Hello world!");

        Configuration cfg = new Configuration(freemarker.template.Configuration.VERSION_2_3_34);
        cfg.setClassForTemplateLoading(Main.class, "/templates");
        cfg.setDefaultEncoding("UTF-8");

        Javalin app = Javalin.create(config -> {
            config.staticFiles.add(staticFiles -> {
                // staticFiles.directory = "/public";
                staticFiles.location = Location.CLASSPATH;
                config.fileRenderer(new JavalinFreemarker());
            });
        }).start(7070);

        app.get("/", ctx -> {
            Map<String, Object> model = Map.of("nome", "Efigênio Luiz");
            ctx.render("/templates/index.ftl", model);
        });

        app.get("/cadastro", ctx -> {
            ctx.render("/templates/cadastro.ftl");
        });

        app.post("/produtos", ctx -> {
            String nomeProduto = ctx.formParam("nome");
            Double precoProduto = Double.parseDouble(ctx.formParam("preco"));
            System.out.println("Nome do Produto: " + nomeProduto);
            System.out.println("Nome do Produto: " + precoProduto);

            Produto produto = new Produto(nomeProduto, precoProduto);
            ctx.render("/templates/produtos.ftl", Map.of("produto", produto));
        });
    }
}