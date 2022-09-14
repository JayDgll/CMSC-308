
using System;
using System.ComponentModel.DataAnnotations;

namespace array;

class Program
{
    static void Main(string[] args)
    {

        string[] email = {"jay.dogillo@gmail.com", "louiejerome.roldan@gmail.com", "leo.po@gmail.com" };
        string[] username = {"jay", "louie jerome", "leo po" };
        string[] password = {"jay1234", "louiejerome1234", "leopo1234" };

        int index;
        Console.Write("Index: ");
        index = Convert.ToInt32(Console.ReadLine());
        if (index == 0)
        {
            Console.WriteLine("Email: " + email[0]);
            Console.WriteLine("Username: " + username[0]);
            Console.WriteLine("Password: " + password[0]);
        }

        if (index == 1)
        {
            Console.WriteLine("Email: " + email[1]);
            Console.WriteLine("Username: " + username[1]);
            Console.WriteLine("Password: " + password[1]);
        }

        if (index == 2)
        {
            Console.WriteLine("Email: " + email[2]);
            Console.WriteLine("Username: " + username[2]);
            Console.WriteLine("Password: " + password[2]);
        }
        Console.ReadKey();
    }
}

