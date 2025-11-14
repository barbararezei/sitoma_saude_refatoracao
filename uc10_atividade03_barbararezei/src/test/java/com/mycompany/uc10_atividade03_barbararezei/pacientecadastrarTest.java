/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package com.mycompany.uc10_atividade03_barbararezei;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import static org.junit.Assert.*;
import org.junit.Test;
import com.mycompany.uc10_atividade03_barbararezei.paciente;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import org.mockito.MockitoAnnotations;
import org.mockito.runners.MockitoJUnitRunner;
import com.mycompany.uc10_atividade03_barbararezei.JPAUtil;
import com.mycompany.uc10_atividade03_barbararezei.conecaobuscarid;
import com.mycompany.uc10_atividade03_barbararezei.pacientecadastrar;
import java.text.SimpleDateFormat;
import org.mockito.runners.MockitoJUnitRunner;



/**
 *
 * @author Usuario
 */
@RunWith(MockitoJUnitRunner.class)
public class pacientecadastrarTest {
    
     @Mock
    private pacientecadastrar pacientecadastrarMock;
     
    public pacientecadastrarTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    
    }   /**
     * Test of cadastrar method, of class pacientecadastrar.
     */
    @Test
    public void testCadastrar() {
        
        boolean resultadoEsperado = true;
      paciente pac = new paciente(7,"amanda","24","hipotireoidismo","levoid","tomar de manha,esperar meia hora pra comer");
      
      Mockito.when(pacientecadastrarMock.cadastrar(pac)).thenReturn(resultadoEsperado);
      
      boolean resultadoobtido = pacientecadastrarMock.cadastrar(pac);
      
      assertEquals(resultadoobtido, true);
        assertEquals("amanda", pac.getNome());
        verify(pacientecadastrarMock, times(1)).cadastrar(pac);
      
    }


    
}
