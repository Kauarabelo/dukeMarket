/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package local.kro.dukemarket.app;

import java.util.Scanner;
import local.kro.dukemarket.bean.Produto;
import local.kro.dukemarket.dao.ProdutoDAO;

/**
 *
 * @author devsys-b
 */
public class DukeMarketApp {
    public static void main(String[] args) {
        
    boolean flag_saida = false;
    int menu;
    Scanner teclado = new Scanner(System.in);
    Produto pAux;
    ProdutoDAO pDAO = new ProdutoDAO();
    
//    //Teste de inclusão de produto
//    pAux = new Produto();
//    pAux.setCodBarras("11111111");
//    pAux.setDescricao("Mouse Logitec Bluetooth");
//    pAux.setQtd(50);
//    pAux.setValorCompra(80.00);
//    pAux.setValorVenda(167.00);
//    
//    pDAO.create(pAux);
//    
//    
//    pAux = new Produto();
//    pAux.setCodBarras("22222222");
//    pAux.setDescricao("Teclado USB Gamer");
//    pAux.setQtd(80);
//    pAux.setValorCompra(104.00);
//    pAux.setValorVenda(220.00);
//    
//    pDAO.create(pAux);
//    
//    
//    pAux = new Produto();
//    pAux.setCodBarras("33333333");
//    pAux.setDescricao("Microcomputador Dell");
//    pAux.setQtd(110);
//    pAux.setValorCompra(2400.00);
//    pAux.setValorVenda(3200.00);
//    
//    pDAO.create(pAux);
//    
//    //Lista geral
//    pDAO.getResults().forEach(p -> {
//        System.out.println(p.toString());
//    });
    


//    //Teste de exclusão de produto
//    pDAO.delete(3);
//    
//    //Lista geral
//    pDAO.getResults().forEach(p -> {
//        System.out.println(p.toString());
//    });



    //Teste de alteração de produto
    pAux = pDAO.getResultById(1);
    pAux.setQtd(100);
    pDAO.update(pAux);
    
    //Lista geral
    pDAO.getResults().forEach(p ->{
        System.out.println(p.toString());
    });
    
        
    // TESTE IMPLEMENTAÇÂO MENU
    
    do{
        System.out.println("--------------------------");
        System.out.println("|  1 - Adicionar Produto |");
        System.out.println("|  2 - Remover Produto   |");
        System.out.println("|  3 - Alterar Produto   |");
        System.out.println("--------------------------");
        menu = teclado.nextInt();
        
        switch(menu){
            case 1:
                
            pAux = new Produto();
            System.out.println("\n Codigo de barras: ");
            pAux.setCodBarras(teclado.next());
            System.out.println("\n Digite a descrição do produto: ");
            pAux.setDescricao(teclado.next());
            System.out.println("\n Digite a quantidade");
            pAux.setQtd(teclado.nextInt());
            pAux.setValorCompra(80.00);
            pAux.setValorVenda(167.00);

            pDAO.create(pAux);

        
        }
    
    
    }while(flag_saida);





    }
}
