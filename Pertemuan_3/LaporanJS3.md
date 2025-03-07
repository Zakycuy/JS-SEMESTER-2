|  | Algorithm and Data Structure |
|--|--|
| NIM | 244107020070 |
| Nama | Raihan Zaky Ramadhan |
| Kelas | TI - 1I |
| Repository | [https://github.com/Zakycuy/JS-SEMESTER-2] () |

# Labs #1 Programing Fundamentals Review

# 1.2.3 Questions

1. Attributes are required to store data that is used later in Methods,
Methods help in manipulating and accessing the attributes of object data
Without attributes and methods, the class will be useless when used in an array of objects.

2. No, because the constructor automatically defaults to the constructor.

3. Rectangle[]   = Declares an array of Rectangle objects.
rectangleArray   menyia= The name of the array variable.
new Rectangle[3] = Creates an array that can store 3 Rectangle object references.
The point is that the code prepares 3 objects that can be inserted into the array

4. Fill the space with objects
rectangleArray[1] = new Rectangle(); => insert into array [1] then 
rectangleArray[1].length = 80 and rectangleArray[1].width = 40;=> means fill the value of array [1] with value 80 for length and value 40 for width.

5. This class separation helps make the code more organized, easy to understand, and flexible for development.
Rectangle => model class that only contains attributes (length and width).
ArrayOfObjects => the main class that manages program logic (such as input and output).

# 1.3.3 Questions

1. Yes, object arrays can be implemented in 2D arrays

2. public static void main(String[] args) {
        Rectangle[][] rectArray = new Rectangle[2][2]; // Array 2x2 dari objek Rectangle
        rectArray[0][0] = new Rectangle(5, 10);
        rectArray[0][1] = new Rectangle(8, 12);
        rectArray[1][0] = new Rectangle(4, 6);
        rectArray[1][1] = new Rectangle(7, 9);

3. new Square[100] only creates a reference array, but not a Square object.
squareArray[5] is still null, because no object is created at that index.
When trying to access squareArray[5].side = 20;, a NullPointerException is thrown.

4. 

