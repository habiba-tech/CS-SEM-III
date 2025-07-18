class Book:
    def __init__(self,isbn,title, author):
        # Initialize a book with given ISBN,title and author
        self.isbn = isbn.strip()            #Remove extra whitespace from ISBN 
        self.title = title.strip()          #Remove extra whitespace from title
        self.author = author.strip()        #Remove extra whitespace from author
        self.available = True               #Book is available by default
        self.borrowed_by = None              #No Borrower initially


    def borrow(self,name):
        #Borrow the book if it's available
        if self.available:
            self.available = False
            self.borrowed_by = name.title()     #Save borrower's name in title-case (e.g: , "Tom")
            return True                         #Return True if book is borrowed successfully
        return False                            #Return False if it is already borrowed
    
    def return_book (self):
        #Return the book if it's borrowed
        if not self.available:
            self.available = True
            self.borrowed_by = None
            return True
        return False
    
    def get_info(self):
        #Return a string containing the book's information
        return f"{self.title.upper()} by {self.author.upper()}-"+\
            ("Available" if self.available else f"Borrowed by {self.borrowed_by}")
    
# Library Class 

class Library:
    def __init__(self):
        #Initialize a library with an empty dictionary
        self.books = {}    #key = ISBN , value = Book object

    def add_book(self,book):
        #Add a book to the library if ISBN not already present
        if book.isbn not in self.books:
            self.books[book.isbn] = book
            return True    #Successfully added the book
        return False   #Book with the same ISBN already exists
    
    def remove_book(self,isbn):
        #Remove a book by ISBN using dictionary pop()
        removed = self.books.pop(isbn,None)
        return removed is not None  #Return True if book is removed, False otherwise
    
    def borrow_book(self,isbn,name):
        #Borrow a book usong its ISBN and borrower's name
        book = self.books.get(isbn)
        return book.borrow(name) if book else False
    
    def return_book(self,isbn):
        #Return a book using its ISBN
        book = self.books.get(isbn)
        return book.return_book() if book else False
    
    def show_books(self):
        #Display all books in the library with their status
        print("Library Book List: ")
        for key,book in self.books.items():  #loop through dictionary items
            print(f"[{key}] {book.get_info()}")  #Show book details

    def search_book(self,keyword):
        #Search for a book by keyword in title or author (Case - insensitive)
        keyword = keyword.lower()
        found = []          #LIst to store matching books

        for book in self.books.values():
            #Check if keyword is in title or author
            if keyword in book.title.lower() or keyword in book.author.lower():
                found.append(book)

        if found:
            #Sort found books by title
            found.sort(key=lambda b:b.title)
            print("Search Results:")
            for b in found:
                print(f" -{b.get_info()}")
        else:
            print("No book found. with that keyword.")


#Driver Code

#Create a library instance
library= Library()

#Create a book instances
b1 = Book("001","Python Basics","ALice")
b2 = Book("002","Data Science","Bob")
b3 = Book("003","Machine Learning","Charlie")

#Add books to library
library.add_book(b1)
library.add_book(b2)
library.add_book(b3)

#Display all books
library.show_books()

#Borrow a book with ISBN "001" by user "tom"
library.borrow_book("001","tom")
print("\nAfter Borrowing: \n ")
library.show_books()  #Display updated list

#Return the borrowed book by keyword "alice"
library.return_book("001")
print("\nAfter Returning: \n ")
library.show_books()  #Display updated list

#Search for books with keyword "alice" in title or author
print("\nSearch by 'alice':")
library.search_book("alice")  
