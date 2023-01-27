using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Zadanie1
{
    public class CurrencyOperations
    {
        public decimal DollarToEuro(decimal Dolars) => Dolars * 1.01m;
        public decimal EuroToDollar(decimal Euros) => Euros * 0.99m;
        public decimal DollarToPLN(decimal Dollar) => Dollar * 4.84m;
        public decimal PLNToDollar(decimal PLN) => PLN * 0.21m;
        public decimal EuroToPLN(decimal Euros) => Euros * 4.78m;
        public decimal PLNToEuro(decimal PLN) => PLN * 0.21m;

        // return in dollars
        public decimal AddDollarsAndEuro(decimal dollars, decimal euro) => dollars + EuroToDollar(euro);

        // return in euro
        public decimal AddEuroAndDollars(decimal euro, decimal dollars) => euro + DollarToEuro(dollars);

        // return in PLN
        public decimal AddDollarsAndEuroToPLN(decimal dollars, decimal euro) => DollarToPLN(dollars) + EuroToPLN(euro);

        // return in PLN
        public decimal SubEuroFromDollarsToPLN(decimal dollars, decimal euro) => dollars + EuroToDollar(euro);
    }
}
