package com.webank.wecross.stub.bcos;

import com.webank.wecross.network.config.ConfigType;
import com.webank.wecross.proof.BlockHeaderProof;
import com.webank.wecross.proof.MerkleProof;
import com.webank.wecross.proof.PathProof;
import com.webank.wecross.proof.RootProof;
import com.webank.wecross.restserver.response.TransactionResponse;

public class BCOSResponse extends TransactionResponse {
    private BlockHeaderProof blockHeader;
    private MerkleProof[] proofs;

    public BCOSResponse() {
        super.setType(ConfigType.TRANSACTION_RSP_TYPE_BCOS);
    }

    @Override
    public RootProof getBlockHeader() {
        return blockHeader;
    }

    public void setBlockHeader(BlockHeaderProof blockHeader) {
        this.blockHeader = blockHeader;
    }

    @Override
    public PathProof[] getProofs() {
        return proofs;
    }

    public void setProofs(MerkleProof[] proofs) {
        this.proofs = proofs;
    }
}
