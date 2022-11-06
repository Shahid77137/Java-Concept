def compute(n):
    if n < 10:
        out = n ** 2
    elif n < 20:
        out = 1
        for i in range(1, n - 9):  
            out *= i
    else:
        lim = n - 19
        out = lim * lim
        out = out - lim
        out = out / 2 
    return out

import pytest

# Here here have three testcases
test_cases = [(4, 16), (15, 120), (25, 15)]

# Here I have created a pytest function
@pytest.mark.parametrize("input_n, expected_output", test_cases)
def test_compute(input_n, expected_output):
    result = compute(input_n)
    assert result == expected_output

# Run the tests
if __name__ == "__main__":
    pytest.main()

