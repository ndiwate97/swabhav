using System;

namespace Protected_Internal_Demo_App
{
    class TestAccess
    {
        void Access()
        {
            var baseObject = new BaseClass();
            baseObject.myValue = 5;
        }
    }
}
