package com.nnk.springboot;

import com.nnk.springboot.repositories.TradeRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class TradeTests {

	@Autowired
	private TradeRepository tradeRepository;

	@Test
	public void tradeTest() {
		/*Trade trade = new Trade("Trade Account", "Type");

		// Save
		trade = tradeRepository.save(trade);
		Assert.assertNotNull(trade.getTradeId());
		Assert.assertTrue(trade.getAccount().equals("Trade Account"));

		// Update
		trade.setAccount("Trade Account Update");
		trade = tradeRepository.save(trade);
		Assert.assertTrue(trade.getAccount().equals("Trade Account Update"));

		// Find
		List<Trade> listResult = tradeRepository.findAll();
		Assert.assertTrue(listResult.size() > 0);

		// Delete
		Integer id = trade.getTradeId();
		tradeRepository.delete(trade);
		Optional<Trade> tradeList = tradeRepository.findById(id);
		Assert.assertFalse(tradeList.isPresent());*/
	}
}
