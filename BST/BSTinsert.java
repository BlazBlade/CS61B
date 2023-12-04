static BST insert(BST T, Key ik) {
  if (T == null)
    return new BST(ik);
  if (ik ≺ T.label())
    T.left = insert(T.left, ik);
  else if (ik ≻ T.label())
    T.right = insert(T.right, ik);  
  return T;
}
if (T.left == null)
    T.left = new BST(ik);
  else if (T.right == null)
    T.right = new BST(ik);
