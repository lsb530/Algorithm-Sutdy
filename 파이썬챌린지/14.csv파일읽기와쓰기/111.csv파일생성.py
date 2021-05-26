import csv

file = open("Books.csv", "w")
books = """To Kill A Mockingbird,Harper Lee,1960
A Brief History of Time,Stephen Hawking,1988
The Great Gatsby,F. Scott Fitzgerald,1922
The Man Who Mistook his Wife for a Hat,Oliver Sacks,1985
Pride and Prejudice,Jane Austen,1813
"""
file.write(books)
file.close()
