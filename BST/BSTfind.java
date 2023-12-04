/** @Author Cloudh2o LV
 */

// f searchKey equals label, return.
// If searchKey ≺ label, search left.
// If searchKey ≻ label, search right.  


static BST find(BST T, Key sk) {
   if (T == null)
      return null;
   if (sk.keyequals(T.label()))
      return T;
   else if (sk ≺ T.label())
      return find(T.left, sk);
   else
      return find(T.right, sk);
}

