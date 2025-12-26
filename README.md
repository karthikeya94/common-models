# Common Models Library

A shared library containing all common model classes, entities, enums, and events for the Real-Time Financial Risk Assessment & Compliance Platform.

## Overview

This library consolidates all shared data models that are used across multiple microservices in the platform. By centralizing these models, we ensure:

- **Consistency**: All services use the same data structures
- **Maintainability**: Changes to models need to be made in only one place
- **Reduced Duplication**: No need to copy model classes between services
- **Type Safety**: Compile-time checking of model compatibility

## Package Structure

```
com.riskplatform.common
├── entity/          # MongoDB document entities
├── enums/           # Shared enumerations
├── event/           # Kafka event models
└── model/           # Simple POJOs and value objects
```

## Entities

### Transaction Domain
- `Transaction` - Main transaction entity with MongoDB mapping
- `ValidationDetails` - Validation result details
- `Customer` - Customer profile entity

### Risk Scoring Domain  
- `CustomerRiskProfile` - Customer risk profile with score history
- `RiskAssessment` - Risk calculation results
- `RiskFactors` - Risk factor breakdown
- `RiskFactorStatus` - Risk factor status tracking
- `ScoreHistoryEntry` - Historical risk score entry
- `MonthlyStats` - Monthly statistics
- `DecisionDetails` - Risk decision explanation
- `RiskFlag` - Risk flag with severity
- `RiskRule` - Risk evaluation rules
- `Anomaly` - Risk anomaly detection
- `EventStoreEntry` - Event sourcing entry
- `EventMetadata` - Event metadata

### Fraud Detection Domain
- `FraudAlert` - Fraud alert entity
- `DetectionResult` - Fraud detection type result
- `Resolution` - Fraud alert resolution
- `FraudFlag` - Fraud detection flag
- `RequiredAction` - Required action for fraud case
- `CustomerRiskContext` - Customer fraud context
- `FraudPattern` - Fraud pattern tracking

### Compliance Domain
- `AuditTrail` - Compliance audit log
- `AuditLogEntry` - Individual audit log entry
- `SarReportRecord` - SAR/CTR report record
- `ReportingPeriod` - Report date range
- `SarTransaction` - SAR report transaction
- `SanctionsHit` - Sanctions screening result

### Orchestration Domain
- `SagaExecutionRecord` - Saga orchestration record
- `SagaStep` - Individual saga step
- `CompensationLog` - Saga compensation log

### Notification Domain
- `Notification` - Notification entity
- `NotificationContent` - Notification content
- `ChannelStatusDetail` - Channel-specific status

## Enums

### Transaction & Status
- `TransactionStatus` - Transaction lifecycle states
- `CustomerStatus` - Customer status states
- `Channel` - Transaction channels (ONLINE, ATM, etc.)
- `DeviceType` - Device types (DESKTOP, MOBILE, etc.)

### Risk & Decision
- `RiskLevel` - Risk levels (LOW, MEDIUM, HIGH, CRITICAL)
- `Decision` - Decision outcomes (PASS, FAIL, REVIEW, etc.)
- `Severity` - Alert severity levels
- `AnomalyType` - Risk anomaly types

### Fraud
- `FraudType` - Fraud detection types
- `AlertStatus` - Fraud alert states
- `ActionType` - Fraud/Compliance action types

### Compliance
- `KycStatus` - KYC verification status
- `AmlStatus` - AML check status
- `SanctionsStatus` - Sanctions screening status
- `ReportType` - Compliance report types

### Orchestration
- `SagaStatus` - Saga execution states
- `SagaStepStatus` - Saga step states

### Notification
- `NotificationChannel` - Notification channels (SMS, EMAIL, PUSH)
- `NotificationStatus` - Notification delivery status
- `Priority` - Notification priority

### Common
- `EventType` - Kafka event types
- `RuleType` - Rule types for risk/fraud

## Events

Kafka event models for inter-service communication:

- `TransactionEvent` - Transaction received/validated events
- `RiskScoreCalculatedEvent` - Risk score calculation results
- `FraudAlertEvent` - Fraud alert notifications
- `ComplianceCheckEvent` - Compliance check results
- `OrchestrationEvent` - Saga orchestration events

## Simple Models

- `Location` - Geographic location (country, city, IP)
- `DeviceInfo` - Device information
- `Beneficiary` - Transaction beneficiary details

## Usage

### Maven Dependency

Add the following dependency to your service's `pom.xml`:

```xml
<dependency>
    <groupId>com.riskplatform</groupId>
    <artifactId>common-models</artifactId>
    <version>1.0.0-SNAPSHOT</version>
</dependency>
```

### Example Usage

```java
import com.riskplatform.common.entity.Transaction;
import com.riskplatform.common.entity.Customer;
import com.riskplatform.common.enums.TransactionStatus;
import com.riskplatform.common.enums.RiskLevel;
import com.riskplatform.common.event.TransactionEvent;
import com.riskplatform.common.model.Location;

// Create a transaction
Transaction transaction = Transaction.builder()
    .transactionId("T789123456")
    .customerId("C123456")
    .amount(5000.00)
    .currency("USD")
    .merchant("Amazon")
    .status(TransactionStatus.VALIDATED)
    .location(Location.builder()
        .country("IN")
        .city("Bangalore")
        .ip("203.0.113.45")
        .build())
    .build();

// Create a Kafka event
TransactionEvent event = TransactionEvent.builder()
    .eventId("evt-001")
    .transactionId("T789123456")
    .customerId("C123456")
    .eventType(EventType.TRANSACTION_VALIDATED)
    .build();
```

## Building

To build and install the library to your local Maven repository:

```bash
cd common-models
mvn clean install
```

## Version History

- **1.0.0-SNAPSHOT** - Initial release with all shared models as per implementation specification
