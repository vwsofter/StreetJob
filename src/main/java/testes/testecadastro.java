/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testes;

import br.comvwsofter.streetjob.model.bean.Cadastro_Funcionario;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author Wagner
 */
public class testecadastro {
    public static void main(String[] args) {
        Cadastro_Funcionario cadfun = new Cadastro_Funcionario();
        cadfun.setNome("wagner xavier");
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("StreetJob_PU");
        EntityManager em = emf.createEntityManager();
        
        
       em.getTransaction().begin();
       em.persist(cadfun);
       em.getTransaction().commit();
       em.close();
       emf.close();
       
        
    }
}
