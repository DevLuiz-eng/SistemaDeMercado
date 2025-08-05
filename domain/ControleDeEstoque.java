package exercicios.exercicioMercado.domain;

import java.util.ArrayList;
import java.util.List;

public class ControleDeEstoque {

    private List<Produto> productsObject = new ArrayList<Produto>();
    private List<String> brands = new ArrayList<String>();
    private List<String> typeProducts = new ArrayList<String>();

    public void newProduct(Produto produto) {

        productsObject.add(produto);
        brands.add(produto.getBrand());
        typeProducts.add(produto.getType());

    }

    public void showProductDetail(Produto produto) {

        System.out.println("Produto: " + produto.getName() + "\nMarca: " + produto.getBrand() + "\nTipo de produto: " + produto.getType() + "\nPreço: " + produto.getPrice() + "\nRestante em estoque: " + produto.getQuantity());

    }

    public void addStock(Produto produto, int qtd) {
        if (qtd <= 0) {
            System.out.println("Valor inválido.");
            return;
        }

        produto.setQuantity(produto.getQuantity() + qtd);

    }

    public void removeStock(Produto produto, int qtd) {

        if (produto.getQuantity() - qtd <= 0) {
            System.out.println("Impossivel fazer retirada desse produto agora. Aguarde a chegada do estoque ou venda.");
            return;
        }

        produto.setQuantity(produto.getQuantity() - qtd);

    }

    public void showAllProducts() {

        if (productsObject.isEmpty()) {
            System.out.println("Lista vazia.");
            return;
        }

        for (Produto p : productsObject) {
            showProductDetail(p);
        }

    }


    public void searchProduct(String nome) {

        for (Produto p : productsObject) {
            if (p.getName().equalsIgnoreCase(nome)) {
                System.out.println("Produto encontrado: ");
                showProductDetail(p);
                return;
            } else {
                System.out.println("Produto não encontrado.");
            }
        }

    }

}
