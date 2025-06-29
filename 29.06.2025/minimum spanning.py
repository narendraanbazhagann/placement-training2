def kruskal(n, edges):
    parent = list(range(n))
    def find(x):
        while x != parent[x]:
            parent[x] = parent[parent[x]]
            x = parent[x]
        return x
    def union(x, y):
        rootX, rootY = find(x), find(y)
        if rootX == rootY: return False
        parent[rootY] = rootX
        return True
    
    edges.sort(key=lambda x: x[2])
    mst_cost, count = 0, 0
    for u, v, cost in edges:
        if union(u, v):
            mst_cost += cost
            count += 1
            if count == n - 1: break
    return mst_cost
