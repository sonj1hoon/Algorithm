class ListStack:
    def __init__(self):
        self.__stack = []
        self.size=0

    def push(self, x):
        self.__stack.append(x)
        self.size += 1

    def pop(self):
        if self.isEmpty():
            return None
        self.size -= 1
        value = self.__stack[self.size]
        self.__stack[self.size] = None 
        del self.__stack[self.size]   
        return value
    
    def isEmpty(self):
        return self.size == 0
    
    def popAll(self):
        self.__stack.clear()
        self.size = 0

n = int(input())
for i in range(n):
    st1 = ListStack()
    arr = input().strip()
    is_valid = True
    for j in arr:
        if j == '(':
            st1.push('(')
        elif j == ')':
            if st1.isEmpty():  # 스택이 비었으면 잘못된 괄호
                is_valid = False
                break
            st1.pop()
    if is_valid and st1.isEmpty():
        print('YES')
    else:
        print('NO')
    st1.popAll()
    