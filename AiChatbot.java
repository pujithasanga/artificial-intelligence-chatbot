# Depth First Search algorithm implementation in Python

def dfs(graph, node, visited=None):
    if visited is None:
        visited = set()
    
    if node not in visited:
        print(f"Visiting Node: {node}")
        visited.add(node)
        
        # Recur for all the vertices adjacent to this vertex
        for neighbour in graph.get(node, []):
            dfs(graph, neighbour, visited)
    return visited

# Define the graph adjacency list
graph_data = {
    'A': ['B', 'C'],
    'B': ['D', 'E'],
    'C': ['F'],
    'D': [],
    'E': [],
    'F': []
}

print("--- Starting DFS Traversal ---")
dfs(graph_data, 'A')