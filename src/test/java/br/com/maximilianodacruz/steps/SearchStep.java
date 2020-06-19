package br.com.maximilianodacruz.steps;

import br.com.maximilianodacruz.pageobjects.HomePage;
import br.com.maximilianodacruz.pageobjects.ResultSearchPage;
import br.com.maximilianodacruz.utils.Utils;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Então;
import io.cucumber.java.pt.Quando;

import static org.junit.Assert.*;

public class SearchStep {

    HomePage homePage = new HomePage();
    ResultSearchPage resultSearchPage = new ResultSearchPage();

    @Dado("que eu adicionar o termo de busca")
    public void que_eu_adicionar_o_termo_de_busca() throws Exception {
        homePage.inputSearch("Maximiliano Alves da Cruz");
    }

    @Quando("eu realizar a busca")
    public void eu_realizar_a_busca() throws Exception {
        homePage.clickSearch();
    }

    @Então("devo validar um conteúdo relativo ao termo de busca")
    public void devo_validar_um_conteúdo_relativo_ao_termo_de_busca() throws Exception {
        resultSearchPage.assertTitle();
    }
}
