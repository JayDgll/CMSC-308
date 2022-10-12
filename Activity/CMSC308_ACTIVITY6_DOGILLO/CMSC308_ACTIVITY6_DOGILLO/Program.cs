using System;

class program
{
    static void Main(String[]args)
    {
        List<char> UpList = new List<char>() { 'S', 'X', 'C', 'O', 'M', 'P', 'U', 'T', 'E', 'R'};

        bool cando = true;
        do
        {
            Console.WriteLine("|     X C O M P U T E R S     |");
            Console.WriteLine("|     1 2 3 4 5 6 7 8 9 0     |");
            Console.Write("\nEnter a Code: ");
            string code = Console.ReadLine();
            int codex = code.Length;
            List<char> mList = new List<char>(codex);
            for (int i = 0; i != codex; i++)
            {
                string j = code[i].ToString().ToUpper();
                if (UpList.Contains(Convert.ToChar(j))is (true))
                {
                    mList.Add(Convert.ToChar(j));
                    cando = false;
                }
                else
                {
                    Console.WriteLine("Void");
                    break;
                }
            }

            Console.Write("\nEquivalent Number: ");
            foreach (char d in mList)
            {
                int source = UpList.IndexOf(d);
                Console.Write(source);

            }
            Console.ReadKey();
            Console.Clear();
        }
        while(cando = true);

    }
}
