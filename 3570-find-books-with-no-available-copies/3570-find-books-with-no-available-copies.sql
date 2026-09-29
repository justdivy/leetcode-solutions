SELECT b.book_id,
       b.title,
       b.author,
       b.genre,
       b.publication_year,
       COUNT(*) AS current_borrowers
FROM library_books AS b
JOIN borrowing_records AS br
    ON b.book_id = br.book_id
WHERE br.return_date IS NULL
GROUP BY b.book_id, b.title, b.author, b.genre, b.publication_year, b.total_copies
HAVING COUNT(*) = b.total_copies
ORDER BY current_borrowers DESC, b.title ASC;