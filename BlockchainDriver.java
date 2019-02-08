import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.List;

public class BlockchainDriver {

    List<Block> blockchain = new ArrayList<Block>();

    public static void main(String[] args) throws NoSuchAlgorithmException {

        String[] transactions = {"Sangjip sent 1K Bitcoin to Ahreum. "};
        Block genesisBlock = new Block(new BlockHeader(null,transactions), transactions);
        System.out.println("Block Hash : "+genesisBlock.getBlockHash());


        String[] secondtransactions = {"Ahreum sent 500 Bitcoin to Sangjip. "};
        Block secondBlock = new Block(new BlockHeader(genesisBlock.getBlockHash().getBytes(),secondtransactions), secondtransactions);
        System.out.println("Second Block Hash : "+genesisBlock.getBlockHash());

        String[] thirdtransactions = {"Sangjip sent 500 Bitcoin to Ahreum. "};
        Block thirdBlock = new Block(new BlockHeader(genesisBlock.getBlockHash().getBytes(),thirdtransactions), thirdtransactions);
        System.out.println("Third Block Hash : "+thirdBlock.getBlockHash());

//
//        transactions[0] = "Sangjip sent 10K Bitcoin to Ahreum";
//        genesisBlock = new Block(new BlockHeader(null, transactions), transactions);
//        System.out.println("Block Hash : " + genesisBlock.getBlockHash());

    }
}
