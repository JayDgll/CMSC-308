
using System;
using System.ComponentModel.DataAnnotations;

namespace array;

class Program
{
    static void Main(string[] args)
    {

        string[] email = { "jay.dogillo@gmail.com", "louiejerome.roldan@gmail.com", "leo.po@gmail.com" };
        string[] username = { "jay", "louie jerome", "leo po" };
        string[] password = { "jay1234", "louiejerome1234", "leopo1234" };

        int index;
        Console.Write("Index: ");
        index = Convert.ToInt32(Console.ReadLine());

        Console.WriteLine("Email: " + email[index]);
        Console.WriteLine("Username: " + username[index]);
        Console.WriteLine("Password: " + password[index]);
        Console.ReadLine();

    }
}

