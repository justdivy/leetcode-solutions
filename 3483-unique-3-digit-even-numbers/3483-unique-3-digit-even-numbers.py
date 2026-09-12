class Solution:
    def totalNumbers(self, digits):
        s = set()

        n = len(digits)

        for i in range(n):
            # Last digit must be even
            if digits[i] % 2 != 0:
                continue

            for j in range(n):
                if i == j:
                    continue

                for k in range(n):
                    # First digit cannot be 0
                    # Also cannot reuse a digit position
                    if k == i or k == j or digits[k] == 0:
                        continue

                    num = digits[k] * 100 + digits[j] * 10 + digits[i]

                    s.add(num)

        return len(s)