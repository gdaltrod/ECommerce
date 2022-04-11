package com.unipe.TE;

public class Main {

    public static void main(String[] args) {
        DeveEncontrarMaiorEMenorComProdutosEmOrdemDecrescente();
        DeveEncontrarMaiorEMenorComProdutosEmOrdemCrescente();
        DeveEncontrarMaiorEMenorComProdutosEmOrdemAleatoria();
        DeveEncontrarMaiorEMenorComUnicoProdutoNoCarrinho();
        DeveEncontrarMaiorEMenorComProdutosDeMesmoValor();
        DeveEncontrarMaiorEMenorComCarrinhoVazio();
    }

    public static void DeveEncontrarMaiorEMenorComUnicoProdutoNoCarrinho(){

        // criando o contexto
        Produto peixe = new Produto("Peixe",50.0 );

        CarrinhoDeCompras carrinho = new CarrinhoDeCompras();
        carrinho.AdicionarProduto(peixe);
        BuscadorDeMaiorEMenor buscador = new BuscadorDeMaiorEMenor();

        // ação
        buscador.Buscar(carrinho);

        // validação
        System.out.println("Teste com carrinho com um único produto: ");
        System.out.println("Produto de maior valor: " + buscador.GetProdutoDeMaiorValor());
        System.out.println("Produto de menor valor: " + buscador.GetProdutoDeMenorValor());
    }

    public static void DeveEncontrarMaiorEMenorComProdutosEmOrdemAleatoria(){

        // criando o contexto
        Produto peixe = new Produto("Peixe",50.0 );
        Produto banana = new Produto("banana", 10.0);
        Produto ovos = new Produto("Ovos", 2);
        CarrinhoDeCompras carrinho = new CarrinhoDeCompras();
        carrinho.AdicionarProduto(banana);
        carrinho.AdicionarProduto(peixe);
        carrinho.AdicionarProduto(ovos);
        BuscadorDeMaiorEMenor buscador = new BuscadorDeMaiorEMenor();

        // ação
        buscador.Buscar(carrinho);

        // validação
        System.out.println("Teste com carrinho em ordem aleatória: ");
        System.out.println("Produto de maior valor: " + buscador.GetProdutoDeMaiorValor());
        System.out.println("Produto de menor valor: " + buscador.GetProdutoDeMenorValor());
    }

    public static void DeveEncontrarMaiorEMenorComProdutosEmOrdemDecrescente(){

        // criando o contexto
        Produto peixe = new Produto("Peixe",50.0 );
        Produto banana = new Produto("banana", 10.0);
        Produto ovos = new Produto("Ovos", 2);
        CarrinhoDeCompras carrinho = new CarrinhoDeCompras();
        carrinho.AdicionarProduto(peixe);
        carrinho.AdicionarProduto(banana);
        carrinho.AdicionarProduto(ovos);
        BuscadorDeMaiorEMenor buscador = new BuscadorDeMaiorEMenor();

        // ação
        buscador.Buscar(carrinho);

        // validação
        System.out.println("Teste com carrinho em ordem decrescente: ");
        System.out.println("Produto de maior valor: " + buscador.GetProdutoDeMaiorValor());
        System.out.println("Produto de menor valor: " + buscador.GetProdutoDeMenorValor());
    }

    public static void DeveEncontrarMaiorEMenorComCarrinhoVazio(){

        // criando o contexto

        CarrinhoDeCompras carrinho = new CarrinhoDeCompras();
        BuscadorDeMaiorEMenor buscador = new BuscadorDeMaiorEMenor();

        // ação
        buscador.Buscar(carrinho);

        // validação
        System.out.println("Teste com carrinho vazio: ");
        System.out.println("Produto de maior valor: " + buscador.GetProdutoDeMaiorValor());
        System.out.println("Produto de menor valor: " + buscador.GetProdutoDeMenorValor());
    }

    public static void DeveEncontrarMaiorEMenorComProdutosEmOrdemCrescente(){
        // criando o contexto
        Produto peixe = new Produto("Peixe",50.0 );
        Produto banana = new Produto("banana", 10.0);
        Produto ovos = new Produto("Ovos", 2);
        CarrinhoDeCompras carrinho = new CarrinhoDeCompras();

        carrinho.AdicionarProduto(ovos);
        carrinho.AdicionarProduto(banana);
        carrinho.AdicionarProduto(peixe);

        BuscadorDeMaiorEMenor buscador = new BuscadorDeMaiorEMenor();

        // ação
        buscador.Buscar(carrinho);

        // validação
        System.out.println("Teste com carrinho em ordem crescente:");
        System.out.println("Produto de maior valor: " + buscador.GetProdutoDeMaiorValor());
        System.out.println("Produto de menor valor: " + buscador.GetProdutoDeMenorValor());
    }

    public static void DeveEncontrarMaiorEMenorComProdutosDeMesmoValor(){
        // criando o contexto
        Produto peixe = new Produto("Peixe",50.0 );
        Produto banana = new Produto("banana", 50.0);
        Produto ovos = new Produto("Ovos", 2);
        CarrinhoDeCompras carrinho = new CarrinhoDeCompras();

        carrinho.AdicionarProduto(ovos);
        carrinho.AdicionarProduto(peixe);
        carrinho.AdicionarProduto(banana);


        BuscadorDeMaiorEMenor buscador = new BuscadorDeMaiorEMenor();

        // ação
        buscador.Buscar(carrinho);

        // validação
        System.out.println("Teste com carrinho com produtos de mesmo valor:");
        System.out.println("Produto de maior valor: " + buscador.GetProdutoDeMaiorValor());
        System.out.println("Produto de menor valor: " + buscador.GetProdutoDeMenorValor());
    }
}
