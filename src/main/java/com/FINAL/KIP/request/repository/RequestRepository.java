package com.FINAL.KIP.request.repository;

import com.FINAL.KIP.document.domain.Document;
import com.FINAL.KIP.request.domain.Request;
import com.FINAL.KIP.user.domain.User;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RequestRepository extends JpaRepository<Request, Long> {

	Boolean existsRequestByRequesterAndDocumentAndIsOk(User requester, Document document, String isOk);



}
