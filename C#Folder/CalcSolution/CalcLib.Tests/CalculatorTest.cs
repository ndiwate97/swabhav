using System;
using Microsoft.VisualStudio.TestTools.UnitTesting;
using CalcLib;

namespace CalcLib.Tests
{
    [TestClass]
    public class CalculatorTest
    {
        [TestMethod]
        public void CubeEvenNoTest()
        {
            //Arrange
            int no = 2;
            Calculator c = new Calculator();
            int expected = 8;

            //Act
            int actual = c.CubeEven(no);

            //Assert
            Assert.AreEqual(expected, actual);
        }
    }
}
