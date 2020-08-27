using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace CustomAttributeApp
{
    [NeedToRefactor]
    public class Foo
    {
        [NeedToRefactor]
        public void M1()
        {

        }

        public void M2()
        {

        }

        [NeedToRefactor]
        public void M3()
        {

        }

        [NeedToRefactor]
        public void M4()
        {

        }
    }
}
