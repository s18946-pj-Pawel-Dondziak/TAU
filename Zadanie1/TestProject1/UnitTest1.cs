using FluentAssertions;
using Zadanie1;

namespace TestProject1
{
    public class Tests
    {
        private CurrencyOperations _obj;

        [SetUp]
        public void Setup() => _obj = new CurrencyOperations();

        [TearDown]
        public void Teardown() => _obj = null;


        [Test]
        public void DollarToEuro_IsReturningCorrectValues() => _obj.DollarToEuro(5m).Should().Be(5.05m);

        [Test]
        public void EuroToDollar_IsReturningCorrectValues() => _obj.EuroToDollar(1.5m).Should().Be(1.485m);

        [Test]
        public void DollarToPLN_IsReturningCorrectValues() => _obj.DollarToPLN(3.95m).Should().Be(19.1180m);

        [Test]
        public void PLNToDollar_IsReturningCorrectValues() => _obj.PLNToDollar(11.6m).Should().Be(2.436m);

        [Test]
        public void EuroToPLN_IsReturningCorrectValues() => _obj.EuroToPLN(7.5m).Should().Be(35.85m);

        [Test]
        public void PLNToEuro_IsReturningCorrectValues() => _obj.PLNToEuro(4.1m).Should().Be(0.861m);

        [Test]
        public void AddDollarsAndEuro_IsReturningCorrectValues() => _obj.AddDollarsAndEuro(4.12m,11.15m).Should().Be(15.1585m);

        [Test]
        public void AddEuroAndDollars_IsReturningCorrectValues() => _obj.AddEuroAndDollars(243.65m,300m).Should().Be(546.65m);

        [Test]
        public void AddDollarsAndEuroToPLN_IsReturningCorrectValues() => _obj.AddDollarsAndEuroToPLN(0.23m, 0.15m).Should().Be(1.8302m);

        [Test]
        public void SubEuroFromDollarsToPLN_IsReturningCorrectValues() => _obj.SubEuroFromDollarsToPLN(11m,5.5m).Should().Be(16.445m);

    }
}