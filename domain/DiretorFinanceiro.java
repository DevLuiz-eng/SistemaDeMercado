package exercicios.exercicioMercado.domain;

public class DiretorFinanceiro {
    ControleDeEstoque controleDeEstoque = new ControleDeEstoque();

    public void apllyDiscount(Produto produto, double porcentagem) {
        double pctg = (porcentagem/100) * produto.getPrice();

        if (produto.getPrice() - pctg <= 0) {
            System.out.println("Desconto muito alto. Impossível aplicar.");
            return;
        }

        produto.setPrice(produto.getPrice() - pctg);
        System.out.println("Desconto de " + porcentagem + "% aplicado com sucesso!");
        controleDeEstoque.showProductDetail(produto);
    }

    public void apllyDiscount(double valorFixo, Produto produto) {

        if (produto.getPrice() - valorFixo <= 0) {
            System.out.println("Desconto muito alto. Impossível aplicar.");
            return;
        }

        produto.setPrice(produto.getPrice() - valorFixo);
        System.out.println("Desconto de " + valorFixo + " reais aplicado com sucesso!");
        controleDeEstoque.showProductDetail(produto);
    }



}
