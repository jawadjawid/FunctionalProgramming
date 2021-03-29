"""Exercise 2."""


def interleave(x_list, y_list):
    """Return a list of corresponding elements from x_list and y_list,
    interleaved. The remaining elements of the longer list are ignored.

    """

    return list(sum(zip(x_list, y_list), ()))


def to_pairs(x_list, y_list):
    """Return a list of pairs of corresponding elements from x_list and y_list,
    interleaved. The remaining elements of the longer list are ignored.
    """

    return list(zip(x_list, y_list))


def repeat(func, val, number):
    """Return a list [x, f(x), f(f(x)), ..., f ^ n(x)].
    Pre: n >= 0
    """
    if number == 0:
        return [val]
    return [val] + list(map(func, repeat(func, val, number - 1)))


def num_neg(x_list):
    """Return a number of negative elements in x_list.
    No recursion, no higher-order functions. Use list comprehension!
    """

    return len([42 for i in x_list if i < 0])


def gen_squares(low, high):
    """Return a list of squares of even integers between low and high, inclusive.
    No recursion, no higher-order functions. Use list comprehension!
    """

    return [i * i for i in range(low, high + 1) if i % 2 == 0]


def triples(number):
    """Return a list of triples (x, y, z) of positive numbers all less
    than or equal to n, such that x ^ 2 + y ^ 2 == z ^ 2, with no
    duplicate triples or premutations of ealier triples.  No
    recursion, no higher-order functions. Use list comprehension!

    """

    return [(x, y, z) for z in range(number + 1)
            for y in range(z) for x in range(y) if x * x + y * y == z * z]
