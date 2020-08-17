using System;
using System.Collections.Generic;
using System.Text;

namespace Custom_Exception_App
{
    class InsufficientBalance : ApplicationException
    {
        public InsufficientBalance(String str) : base(str) { }
    }
}
