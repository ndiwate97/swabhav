namespace ExtensionMethodApp.CustomExt
{
    public static class StringExtensions
    {
        public static string ToSnake_Case(this string s)
        {
            int n = s.Length;
            string str = "";

            for (int i = 0; i < n; i++)
            {
                if (s[i] == ' ')
                    str = str + '_';
                else
                    str = str +(s[i]);
            }
            return str;
        }
    }
}
