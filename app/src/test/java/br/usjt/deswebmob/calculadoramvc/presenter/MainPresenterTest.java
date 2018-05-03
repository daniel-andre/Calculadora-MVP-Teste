package br.usjt.deswebmob.calculadoramvc.presenter;


import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import br.usjt.deswebmob.calculadoramvc.model.Calculadora;
import br.usjt.deswebmob.calculadoramvc.view.MainActivity;
import br.usjt.deswebmob.calculadoramvc.view.MainView;

import static junit.framework.Assert.assertEquals;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class MainPresenterTest {
    private MainPresenter presenter;

    @Mock
    private MainView view;

    @Before
    public void setUp(){
        presenter = new MainPresenter(view);
        presenter.onCreate();
    }

    @Test
    public void testCalculo(){
        when(view.getValor1()).thenReturn("1");
        when(view.getValor2()).thenReturn("2");
        when(view.getOperador()).thenReturn("+");
        //when(view.getResultado()).thenReturn("3");
        presenter.calculo();
        assertEquals("3", presenter.getResultado());

        when(view.getValor1()).thenReturn("2");
        when(view.getValor2()).thenReturn("5");
        when(view.getOperador()).thenReturn("*");
        //when(view.getResultado()).thenReturn("3");
        presenter.calculo();
        assertEquals("10", presenter.getResultado());

//        when(view.getValor1()).thenReturn("1");
//        when(view.getValor2()).thenReturn("2");
//        when(view.getOperador()).thenReturn("+");
//        //when(view.getResultado()).thenReturn("3");
//        presenter.calculo();
//        assertEquals("3", presenter.getResultado());

    }

}
