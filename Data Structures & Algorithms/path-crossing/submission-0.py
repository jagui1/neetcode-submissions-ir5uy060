class Solution:
    def isPathCrossing(self, path: str) -> bool:
        space = [0,0]
        seen = set()

        seen.add(tuple(space))

        for direction in path:
            space = self.move(direction, space)
            
            if tuple(space) in seen:
                return True
            else:
                seen.add(tuple(space))

        return False
    
    def move(self, direction, space):
        match direction:
            case 'N':
                space[1] += 1
                return space
            case 'E':
                space[0] += 1
                return space
            case 'W':
                space[0] -= 1
                return space
            case 'S':
                space[1] -= 1
                return space


        