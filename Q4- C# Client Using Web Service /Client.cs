using System;
namespace Rextester
{
    public class Program
    {
        public static void Main(string[] args)
        {
		SayHelloServiceService service = new SayHelloServiceService();
         Console.WriteLine(service.sayHello("Mohamed"));

        }
    }
}
