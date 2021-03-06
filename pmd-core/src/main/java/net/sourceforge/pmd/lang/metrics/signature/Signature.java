/**
 * BSD-style license; for more info see http://pmd.sourceforge.net/license.html
 */

package net.sourceforge.pmd.lang.metrics.signature;

import net.sourceforge.pmd.lang.ast.SignedNode;

/**
 * Signature of a node.
 *
 * @param <N> The type of node this signature signs
 *
 * @author Clément Fournier
 */
public interface Signature<N extends SignedNode<N>> {
}
