def evaluate(expr):
    def helper(tokens):
        stack, num, sign = [], 0, '+'
        while tokens:
            token = tokens.pop(0)
            if token.isdigit():
                num = int(token)
            if token == '(':
                num = helper(tokens)
            if not token.isdigit() or not tokens:
                if sign == '+': stack.append(num)
                elif sign == '-': stack.append(-num)
                elif sign == '*': stack[-1] *= num
                elif sign == '/': stack[-1] = int(stack[-1] / num)
                sign = token
                num = 0
            if token == ')': break
        return sum(stack)

    return helper(list(expr.replace(" ", "")))
