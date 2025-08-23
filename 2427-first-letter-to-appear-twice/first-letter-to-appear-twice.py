class Solution:
    def repeatedCharacter(self, s: str) -> str:
        set_ch = set()
        final_ch=''
        for ch in s:
            if ch in set_ch:
                final_ch=ch
                break
            set_ch.add(ch)
        return final_ch