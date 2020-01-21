//Donark Patel
//CSC 236-01
//Lab 6B

public class HeapDemo
{
        public static void main(String[] args)
        {
                System.out.println("Original Heap\n");

                Heap<Integer> heap1 = new Heap<Integer>();

                for (int i = 1; i <= 10; i++)
                {
                    heap1.add(i);
                }
                System.out.println(heap1);
                System.out.println("\n\nHeap after removal\n");

                for (int i = 0; i < 3; i++)
                {
                     heap1.remove();
                }
                System.out.println (heap1);

        }
}
