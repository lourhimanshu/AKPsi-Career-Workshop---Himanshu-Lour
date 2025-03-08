def cigar_party(cigars, is_weekend):
    # If it's the weekend, only check if cigars are at least 40
    if is_weekend:
        return cigars >= 40
    # If it's not the weekend, cigars must be between 40 and 60 (inclusive)
    return 40 <= cigars <= 60
