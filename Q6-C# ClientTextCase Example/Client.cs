using System;
namespace Rextester
{
    public class Program
    {
        public static void Main(string[] args)
        {
		TextCasing service = new TextCasing();
         Console.WriteLine(service.InvertStringCase("ABCD"));

        }
    }
}
