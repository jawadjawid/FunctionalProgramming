module E4 where

-- |interleave xs ys
-- return a list of corresponding elements from xs and ys, 
-- interleaved. The remaining elements of the longer list
-- are ignored.
interleave:: [a] -> [a] -> [a]
interleave xs ys = concat (zipWith (\x y -> x:[y]) xs ys)

-- |toPairs xs ys
-- return a list of pairs of corresponding elements from xs and ys, 
-- interleaved. The remaining elements of the longer list
-- are ignored.
toPairs:: [a] -> [b] -> [(a, b)]
toPairs = zip

-- |repeat f x n
-- return a list [x, f(x), f(f(x)), ..., f^n(x)]
-- requires n >= 0
repeat':: (a -> a) -> a -> Int -> [a]
repeat' f x n = take (n + 1) (iterate f x)      

-- |numNeg xs 
-- return a number of negative elements in xs
-- No recursion, no higher-order functions. Use list comprehension!
numNeg :: (Ord a, Num a) => [a] -> Int
numNeg xs = sum [ if x >= 0 then 0 else 1 | x <- xs ]

-- |genSquares low high
-- return a list of squares of even integers between low and high, inclusive.
-- No recursion, no higher-order functions. Use list comprehension!
genSquares :: Int -> Int -> [Int]
genSquares x y = [xs*xs | xs <- [x .. y], even xs]


-- |triples n 
-- return a list of triples (x,y,z) of positive numbers all less than
-- or equal to n, such that x^2 + y^2 == z^2, with no duplicate triples or
-- premutations of ealier triples.
-- No recursion, no higher-order functions. Use list comprehension!
triples :: Int -> [(Int, Int, Int)]
triples n = [(x,y,z) | z <- [1..n], y <- [1..z], x <- [1..y], x*x + y*y == z*z]  