package pl.pjwstk.s18946;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.MatcherAssert.assertThat;

public class CurrencyOperationsTest {

    private CurrencyOperations currencyOperations;

    @BeforeEach
    public void init() {
        currencyOperations = new CurrencyOperations();
    }

    @AfterEach
    public void clean() {
        currencyOperations = null;
    }

    @Test
    public void dollarToEuro_IsReturningCorrectValues() {
        //GIVEN
        double dollars = 5;

        //WHEN
        double answer = currencyOperations.dollarToEuro(dollars);

        //THEN
        assertThat(5.05, is(answer));
    }

    @Test
    public void euroToDollar_IsReturningCorrectValues() {
        //GIVEN
        double euro = 1.7;

        //WHEN
        double answer = currencyOperations.euroToDollar(euro);

        //THEN
        assertThat(1.683, is(answer));
    }

    @Test
    public void dollarToPLN_IsReturningCorrectValues() {
        //GIVEN
        double dollar = 3.95;

        //WHEN
        double answer = currencyOperations.dollarToPLN(dollar);

        //THEN
        assertThat(19.118, is(answer));
    }

    @Test
    public void plnToDollar_IsReturningCorrectValues() {
        //GIVEN
        double pln = 11.6;

        //WHEN
        double answer = currencyOperations.plnToDollar(pln);

        //THEN
        assertThat(2.436, is(answer));
    }

    @Test
    public void euroToPLN_IsReturningCorrectValues() {
        //GIVEN
        double euro = 7.5;

        //WHEN
        double answer = currencyOperations.euroToPLN(euro);

        //THEN
        assertThat(35.85, is(answer));
    }

    @Test
    public void plnToEuro_IsReturningCorrectValues() {
        //GIVEN
        double pln = 4.5;

        //WHEN
        double answer = currencyOperations.plnToEuro(pln);

        //THEN
        assertThat(0.945, is(answer));
    }

    @Test
    public void addDollarsAndEuro_IsReturningCorrectValues() {
        //GIVEN
        double dollar = 4.12;
        double euro = 11.15;

        //WHEN
        double answer = currencyOperations.addDollarsAndEuro(dollar,euro);

        //THEN
        assertThat(15.1585, is(answer));
    }

    @Test
    public void addEuroAndDollars_IsReturningCorrectValues() {
        //GIVEN
        double euro = 243.65;
        double dollar = 300;

        //WHEN
        double answer = currencyOperations.addEuroAndDollars(euro, dollar);

        //THEN
        assertThat(546.65, is(answer));
    }

    @Test
    public void addDollarsAndEuroToPLN_IsReturningCorrectValues() {
        //GIVEN
        double dollar = 0.23;
        double euro = 0.15;

        //WHEN
        double answer = currencyOperations.addDollarsAndEuroToPLN(dollar, euro);

        //THEN
        assertThat(1.8302, is(answer));
    }

    @Test
    public void subEuroFromDollarsToPLN_IsReturningCorrectValues() {
        //GIVEN
        double dollar = 11;
        double euro = 5.5;

        //WHEN
        double answer = currencyOperations.subEuroFromDollarsToPLN(dollar,euro);

        //THEN
        assertThat(16.445, is(answer));
    }
}
