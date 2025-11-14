/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package com.mycompany.uc10_atividade03_barbararezei;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

import com.mycompany.uc10_atividade03_barbararezei.paciente;
import com.mycompany.uc10_atividade03_barbararezei.incidente;
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
import com.mycompany.uc10_atividade03_barbararezei.incidentecadastrar;
import java.text.SimpleDateFormat;
import org.mockito.runners.MockitoJUnitRunner;

/**
 *
 * @author Usuario
 */
@RunWith(MockitoJUnitRunner.class)
public class incidentecadastrarTest {
    
    @Mock
     private incidentecadastrar incidentecadastrarMock;
    
    public incidentecadastrarTest() {
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
    }

    /**
     * Test of cadastrar method, of class incidentecadastrar.
     */
    @Test
    public void testCadastrar() {
        
          boolean resultadoEsperado = true;
      incidente inc = new incidente(10 , 2,"20/04/2025","16h30","tremenda dor de barriga");
      
      Mockito.when(incidentecadastrarMock.cadastrar(inc)).thenReturn(resultadoEsperado);
      
      boolean resultadoobtido = incidentecadastrarMock.cadastrar(inc);
      
      assertEquals(resultadoobtido, true);
        assertEquals("20/04/2025", inc.getData());
        verify(incidentecadastrarMock, times(1)).cadastrar(inc);
    }
    
}
