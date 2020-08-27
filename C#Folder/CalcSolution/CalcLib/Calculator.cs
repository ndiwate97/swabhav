using System;

namespace CalcLib
{
    public class Calculator
    {
        public int CubeEven(int no)
        {
            if (no % 2 == 0)
            {
                return no * no * no;
            }
            throw new Exception(String.Format("Number {0} is not even", no));
        }
    }
}

