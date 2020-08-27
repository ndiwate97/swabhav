using System;

namespace CustomExceptionApp.Model
{
    class InsufficientFundException : ApplicationException
    {
        public InsufficientFundException(String str) : base(str) { }
    }
}
